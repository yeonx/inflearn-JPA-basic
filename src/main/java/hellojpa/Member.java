//package hellojpa;
//
//import javax.persistence.*;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.Date;
//
//@Entity
////@SequenceGenerator(name = "member_seq_generator", sequenceName = "member_seq")
//public class Member {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
////    @Column(unique = true,length = 10) //unique : 실행 자체에 영향을 주지 않음. DDL 자동 생성 시에 사용됨.
//    @Column(name = "name")
//    private String name;
//
////    private Integer age;
////
////    @Enumerated(EnumType.STRING) // DB에는 enum타입이 없어서.
////    private RoleType roleType;
////
////    @Temporal(TemporalType.TIMESTAMP) // 날짜 타입
////    private Date createdDate;
////
////    @Temporal(TemporalType.TIMESTAMP)
////    private Date lastModifiedDate;
////
////    private LocalDate testLocalDate;
////    private LocalDateTime testLocalDateTime;
////
////    @Lob //큰 컨텍스트를 넣고 싶으면
////    private String description;
//
//    public Member() {
//    }
//}
