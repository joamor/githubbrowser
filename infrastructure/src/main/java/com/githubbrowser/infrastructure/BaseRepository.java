package com.githubbrowser.infrastructure;

import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;

@NoRepositoryBean
public interface BaseRepository<E, I> extends Repository<E, I> {

    E save(E entity);

}
