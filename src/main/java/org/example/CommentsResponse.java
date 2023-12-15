package org.example;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class CommentsResponse implements Serializable {
  private Integer total;

  private List<Comments> comments;

  private Integer limit;

  private Integer skip;

  public Integer getTotal() {
    return this.total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public List<Comments> getComments() {
    return this.comments;
  }

  public void setComments(List<Comments> comments) {
    this.comments = comments;
  }

  public Integer getLimit() {
    return this.limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getSkip() {
    return this.skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  public static class Comments implements Serializable {
    private Integer id;

    private Integer postId;

    private String body;

    private User user;

    public Integer getId() {
      return this.id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public Integer getPostId() {
      return this.postId;
    }

    public void setPostId(Integer postId) {
      this.postId = postId;
    }

    public String getBody() {
      return this.body;
    }

    public void setBody(String body) {
      this.body = body;
    }

    public User getUser() {
      return this.user;
    }

    public void setUser(User user) {
      this.user = user;
    }

    public static class User implements Serializable {
      private Integer id;

      private String username;

      public Integer getId() {
        return this.id;
      }

      public void setId(Integer id) {
        this.id = id;
      }

      public String getUsername() {
        return this.username;
      }

      public void setUsername(String username) {
        this.username = username;
      }
    }
  }
}
