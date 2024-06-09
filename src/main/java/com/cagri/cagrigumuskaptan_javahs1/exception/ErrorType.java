package com.cagri.cagrigumuskaptan_javahs1.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ErrorType {

    BAD_REQUEST_ERROR(1001, "Girilen bilgiler eksik ya da yanlıştır.", HttpStatus.BAD_REQUEST),
    INTERNAL_SERVER_ERROR(9998, "Sunucuda beklenmeyen bir hata oluştu, Lütfen tekrar deneyiniz", HttpStatus.INTERNAL_SERVER_ERROR),
    INTERNAL_SERVER_ERROR_NOT_FOUND_DATA(1002, "Sunucu Hatası: Liste getirilemedi, lütfen tekrar deneyin", HttpStatus.INTERNAL_SERVER_ERROR),
    PRODUCT_IMAGEURLS_EMPTY_ERROR(1003, "Urun resimleri bulunamadi, lutfen urun resimlerini yukleyiniz", HttpStatus.BAD_REQUEST),
    PRODUCT_NOT_FOUND_ERROR(1006, "Urun sistemde kayitli degildir!", HttpStatus.BAD_REQUEST),
    PRODUCT_INVALID_PARAMETER_ERROR(1005, "Urun Id si ya da urun fotograf URL'lerinin girilmesi zorunludur.",HttpStatus.BAD_REQUEST),
    PRODUCT_EXISTS_ERROR(1004, "Urun sistemde kayitlidir, lutfen baska bir urun kaydediniz!", HttpStatus.BAD_REQUEST);

    private Integer code;
    private String message;
    private HttpStatus httpStatus;
}
