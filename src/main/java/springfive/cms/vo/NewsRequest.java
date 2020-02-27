package springfive.cms.vo;

import lombok.Data;
import springfive.cms.models.Category;
import springfive.cms.models.Tag;

import java.util.Set;

@Data
public class NewsRequest {

    String title;
    String content;
    Set<Category> categories;
    Set<Tag> tags;
}
