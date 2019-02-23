package repositories;

import hibernate.HibernateConnection;
import model.Author;

public class AuthorRepository extends GenericRepository<Author,Integer> implements IAuthorRepository{

    @Override
    public void save(Author author) {
        super.create(author);
    }

    @Override
    public void delete(int id) {
        super.deleteById(id);
    }

    @Override
    public void edit(Author author) {
        super.update(author);
    }

    @Override
    public Author find(int id) {
       return super.read(id);
    }
}
