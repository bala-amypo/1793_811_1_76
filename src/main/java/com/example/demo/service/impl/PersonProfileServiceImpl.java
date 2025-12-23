@Service
public class PersonProfileServiceImpl implements PersonProfileService {

    @Autowired
    private PersonProfileRepository repo;

    public PersonProfile create(PersonProfile p) {
        return repo.save(p);
    }

    public PersonProfile getById(Long id) {
        return repo.findById(id).orElseThrow();
    }

    public PersonProfile getByReferenceId(String ref) {
        return repo.findByReferenceId(ref).orElseThrow();
    }

    public List<PersonProfile> getAll() {
        return repo.findAll();
    }

    public PersonProfile updateRelationshipDeclared(Long id, boolean declared) {
        PersonProfile p = getById(id);
        p.setRelationshipDeclared(declared);
        return repo.save(p);
    }
}
