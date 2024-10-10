package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    //Definir uma constante
    //Apenas uma copia pra aplicação inteira
    public static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime date;
    private String title;
    private String content;
    private Integer likes;

    private List<Comment> comments = new ArrayList<>();

    public Post(){

    }

    public Post(LocalDateTime date, String title, String content, Integer likes) {
        this.date = date;
        this.title = title;
        this.content = content;
        this.likes = likes;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void addComment(Comment comment) {
        //Lista comments recebendo o comentario que vem do argumento
        comments.add(comment);
    }

    public void removeComment(Comment comment) {
        //Lista comments removendo o comentário que vem do argumento
        comments.remove(comment);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        //concatenar outras strings com a função append(acrescentar no final)
        sb.append(title + "\n");
        sb.append(likes + " Likes - ");
        sb.append(formatter.format(date) + "\n");
        sb.append(content + "\n");
        sb.append("Comments:\n");
        for(Comment c : comments){
            //pegar os comentarios
            sb.append(c.getText() + "\n");
        }

        return sb.toString();
    }
}
