package com.co.sofka.Perfect_cosmetic.domain.gender.repository;

import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Comments;
import com.co.sofka.Perfect_cosmetic.domain.gender.values.CommentsId;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICommentsRepository extends CrudRepository<Comments, CommentsId> {
}
