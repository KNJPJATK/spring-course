package pl.knpj.crudapplication.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Post {

    @Id
    private Long id;

    @Column(nullable = false)
    @Temporal(value = TemporalType.DATE)
    private Date createDate;

    @Lob
    @Column(nullable = false)
    private String content;

    @ManyToOne
    @JoinColumn(nullable = false)
    private User author;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Post{" +
                "id=" + id +
                ", createDate=" + createDate +
                ", content='" + content + '\'' +
                ", author=" + author +
                '}';
    }
}
