package diplom2.DTO.resposeDTO;

import diplom2.entity.Ingredient;
import io.qameta.allure.Story;
import lombok.Data;

import java.util.List;

@Data
@Story("Return of ingredients")
public class ResponseGetIngredients {
    private String success;
    private List<Ingredient> data;
}
