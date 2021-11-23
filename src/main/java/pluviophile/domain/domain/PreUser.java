package pluviophile.domain.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor  // 모든 변수 param인 생성자 Member(name, age, email);
@AllArgsConstructor
@Builder
@Entity
public class PreUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 연결된 db의 넘버링 전략을 따라감
    private Long id;
    @Column
    private String type;
    @Column(unique = true)
    private String phoneNum;
    @Column
    private String page;
}
