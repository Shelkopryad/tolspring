package src.restful.services;

import src.restful.Comment;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by Svirin2-DA on 11.12.2018.
 */
public class CommentService {

    private AtomicLong id = new AtomicLong(0L);
    private Map<Long, Comment> comments;

    public CommentService() {
        if (this.comments == null) {
            this.comments = new HashMap<Long, Comment>();
        }
    }

    public Map<Long, Comment> getComments() {
        return comments;
    }

    public void setComments(Map<Long, Comment> comments) {
        this.comments = comments;
    }

    public Comment getById(long id) {
        return this.comments.get(id) == null ? null : this.comments.get(id);
    }

}
