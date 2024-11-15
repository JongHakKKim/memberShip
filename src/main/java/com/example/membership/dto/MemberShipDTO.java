package com.example.membership.dto;


import com.example.membership.constant.Role;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MemberShipDTO {


    private Long num;       // 반값이나 notnull 허용할꺼야?
                            // 등록시에는 필요없으니까 notnull같은거 안씀

    @NotBlank(message = "이름을 꼭 쓰여야 합니다.")
    @Size(min = 2 , max = 10 , message = "이름은 두글자에서 10글자 이내로 작성하시오 ex)홍길동")
    private String name;    // 이름 // 낫 블링크 최소 : 2 , 최대 : 10

    @NotBlank(message = "빈문자, 공백, 빈값을 허용하지 않습니다. 꼭 이메일을 작성하셔야 합니다")
    @Size(max = 50, message = "최대 50글자를 넘지 마세요")
    @Email(message = "이메일을 꼭 쓰셔야합니다.")
    private String email;   // 이메일   // email , 최대값은 20 글자 : 메세지 : 최대 2

    @NotBlank(message = "비밀번호는 꼭 작성하셔야 합니다.")
    @Size(min = 10 , max = 16, message = "최소 10에서 최대 16이내로 비밀번호를 작성하시오")
    private String password;  // 비밀번호   // 최소 : 10 , 최대 16메세지 : 최소 8 에서 최대 16 이내로 비밀번호를 작성하셔야
    
    @NotBlank(message = "주소는 꼭 작성하셔야 합니다.")
    private String address;     // 주소   // 낫 블링크


    private Role role;      // 이건 어차피 유저디테일 서비스에서 직접 넣어줄꺼임 // 필요에 따라서 어드민 가입페이지와
                            // 일반유저 가입페이지가 분리될수 있음



}
