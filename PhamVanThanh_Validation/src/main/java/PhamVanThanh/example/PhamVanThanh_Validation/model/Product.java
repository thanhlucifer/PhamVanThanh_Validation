package PhamVanThanh.example.PhamVanThanh_Validation.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class Product {

    private int id;
    @NotBlank(message = "Tên sản phẩm không được để trống")
    private String name;
    @Length(min=0, max = 50, message=" ten hinh khong duoc de trong")
    private String image;

    @NotNull(message = "gia san pham khong duoc de trong")
    @Min(value = 1,message = "gia san pham khong duoc nho hon 1")
    @Max(value = 9999999, message = "gia san pham khong duoc lon hon 9999999")
    private long price;

}
