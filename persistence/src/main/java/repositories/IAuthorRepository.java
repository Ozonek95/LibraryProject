package repositories;

import model.Author;

public interface IAuthorRepository {
    void save(Author author);
    void delete(int id);
    void edit(Author author);
    Author find(int id);
}
