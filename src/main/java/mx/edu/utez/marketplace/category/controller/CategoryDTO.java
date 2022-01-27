package mx.edu.utez.marketplace.category.controller;

public class CategoryDTO {
    private Long id;
    private String description;

    public CategoryDTO() {
    }

    public CategoryDTO(String description) {
        this.description = description;
    }

    public CategoryDTO(Long id, String description) {
        this.id = id;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
