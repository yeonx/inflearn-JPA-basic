//package hellojpa;
//
//import javax.persistence.*;
//import java.util.*;
//
//
//@Entity
////@SequenceGenerator(name = "member_seq_generator", sequenceName = "member_seq")
//public class Member extends BaseEntity{
//
//    @Id @GeneratedValue
//    private Long id;
//
////    @Column(unique = true,length = 10) //unique : 실행 자체에 영향을 주지 않음. DDL 자동 생성 시에 사용됨.
//    @Column(name = "USERNAME")
//    private String username;
//
//    @Embedded
//    private Address homeAddress;
//
//    public Address getHomeAddress() {
//        return homeAddress;
//    }
//
//    public void setHomeAddress(Address homeAddress) {
//        this.homeAddress = homeAddress;
//    }
//
//    public Set<String> getFavoriteFoods() {
//        return favoriteFoods;
//    }
//
//    public void setFavoriteFoods(Set<String> favoriteFoods) {
//        this.favoriteFoods = favoriteFoods;
//    }
//
////    public List<Address> getAddressHistory() {
////        return addressHistory;
////    }
////
////    public void setAddressHistory(List<Address> addressHistory) {
////        this.addressHistory = addressHistory;
////    }
//
//    @ElementCollection
//    @CollectionTable(name = "FAVORITE_FOOD", joinColumns =
//    @JoinColumn(name = "MEMBER_ID"))
//    @Column(name = "FOOD_NAME")
//    private Set<String> favoriteFoods = new HashSet<>();
//
////    @OrderColumn(name = "address_history_order")
////    @ElementCollection
////    @CollectionTable(name = "ADDRESS",  joinColumns =
////    @JoinColumn(name = "MEMBER_ID"))
////    private List<Address> addressHistory = new ArrayList<>();
//
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    @JoinColumn(name="MEMBER_ID")
//    private List<AddressEntity> addressHistory = new ArrayList<>();
//
//    @ManyToOne
//    @Column(name = "TEAM_ID",insertable = false,updatable = false)
//    private Team team;
//
//    @OneToOne
//    @JoinColumn(name = "LOCKER_ID")
//    private Locker locker;
//
//    @OneToMany(mappedBy = "member")
//    private List<MemberProduct> memberProducts = new ArrayList<>();
//
//
//
////    private Integer age;
//
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
////    public Member() {
////    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public Team getTeam() {
//        return team;
//    }
//
//    public void setTeam(Team team) {
//        this.team = team;
//    }
//
//    public Locker getLocker() {
//        return locker;
//    }
//
//    public void setLocker(Locker locker) {
//        this.locker = locker;
//    }
//
//    public List<MemberProduct> getMemberProducts() {
//        return memberProducts;
//    }
//
//    public void setMemberProducts(List<MemberProduct> memberProducts) {
//        this.memberProducts = memberProducts;
//    }
//}
