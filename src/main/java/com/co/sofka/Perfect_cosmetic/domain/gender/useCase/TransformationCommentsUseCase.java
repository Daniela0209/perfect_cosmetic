package com.co.sofka.Perfect_cosmetic.domain.gender.useCase;


import com.co.sofka.Perfect_cosmetic.domain.gender.entity.Comments;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.CommentsData;
import com.co.sofka.Perfect_cosmetic.domain.gender.repository.ICommentsDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransformationCommentsUseCase {

    @Autowired
    public ICommentsDataRepository data;

    public CommentsData transform(Comments comments) {

        CommentsData commentsData = new CommentsData(comments.getIdComments(), comments.getUserId().value(), comments.getContents().value());
        return commentsData;
    }

    public Iterable<CommentsData> investigate() {
        return data.findAll();
    }

    public String delete(String id) {

        try {
            data.deleteById(id);
            return "comentario eliminado exitosamente";
        } catch (Exception e) {
            return "No se pudo eliminar el comentario correctamente";
        }
    }
}
