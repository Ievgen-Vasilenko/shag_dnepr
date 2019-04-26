package models;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "add")
public class Add {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "city")
    private City city;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "realty_type")
    private RealtyType realtyType;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "wall_type")
    private WallType wallType;

    @Column(name = "rooms")
    private int rooms;

    @Column(name = "total_area")
    private float totalArea;

    @Column(name = "living_space")
    private float livingSpace;

    @Column(name = "kitchen")
    private float kitchen;

    @Column(name = "floor")
    private int floor;

    @Column(name = "number_floors")
    private int numberFloors;

    @Column(name = "year_built")
    private int yearBuilt;

    @Column(name = "price")
    private int price;

    @Column(name = "photo1")
    private String photo1;

    @Column(name = "photo2")
    private String photo2;

    @Column(name = "photo3")
    private String photo3;

    @Column(name = "photo4")
    private String photo4;

    @Column(name = "photo5")
    private String photo5;

    @Column(name = "photo6")
    private String photo6;

    @Column(name = "photo7")
    private String photo7;

    @Column(name = "announcement_text")
    private String announcementText;

    @Column(name = "contact_phone")
    private String contactPhone;

    @Column(name = "contact_name")
    private String contactName;

    @Column(name = "add_date")
    private Timestamp addDate;

    @Column(name = "folder")
    private String folder;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "identyUser")
    private User user;

    public Add(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public RealtyType getRealtyType() {
        return realtyType;
    }

    public void setRealtyType(RealtyType realtyType) {
        this.realtyType = realtyType;
    }

    public WallType getWallType() {
        return wallType;
    }

    public void setWallType(WallType wallType) {
        this.wallType = wallType;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public float getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(float totalArea) {
        this.totalArea = totalArea;
    }

    public float getLivingSpace() {
        return livingSpace;
    }

    public void setLivingSpace(float livingSpace) {
        this.livingSpace = livingSpace;
    }

    public float getKitchen() {
        return kitchen;
    }

    public void setKitchen(float kitchen) {
        this.kitchen = kitchen;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getNumberFloors() {
        return numberFloors;
    }

    public void setNumberFloors(int numberFloors) {
        this.numberFloors = numberFloors;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    public void setYearBuilt(int yearBuilt) {
        this.yearBuilt = yearBuilt;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    public String getPhoto4() {
        return photo4;
    }

    public void setPhoto4(String photo4) {
        this.photo4 = photo4;
    }

    public String getPhoto5() {
        return photo5;
    }

    public void setPhoto5(String photo5) {
        this.photo5 = photo5;
    }

    public String getPhoto6() {
        return photo6;
    }

    public void setPhoto6(String photo6) {
        this.photo6 = photo6;
    }

    public String getPhoto7() {
        return photo7;
    }

    public void setPhoto7(String photo7) {
        this.photo7 = photo7;
    }

    public String getAnnouncementText() {
        return announcementText;
    }

    public void setAnnouncementText(String announcementText) {
        this.announcementText = announcementText;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public Timestamp getAddDate() {
        return addDate;
    }

    public void setAddDate(Timestamp addDate) {
        this.addDate = addDate;
    }

    public String getFolder() {
        return folder;
    }

    public void setFolder(String folder) {
        this.folder = folder;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
