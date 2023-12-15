package org.example;

import java.io.Serializable;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.List;

public class UsersResponse implements Serializable {
  private Integer total;

  private Integer limit;

  private Integer skip;

  private List<Users> users;

  public Integer getTotal() {
    return this.total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public Integer getLimit() {
    return this.limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  public Integer getSkip() {
    return this.skip;
  }

  public void setSkip(Integer skip) {
    this.skip = skip;
  }

  public List<Users> getUsers() {
    return this.users;
  }

  public void setUsers(List<Users> users) {
    this.users = users;
  }

  public static class Users implements Serializable {
    private String lastName;

    private String gender;

    private String university;

    private String maidenName;

    private String ein;

    private String ssn;

    private String bloodGroup;

    private String password;

    private Hair hair;

    private Bank bank;

    private String eyeColor;

    private Company company;

    private Integer id;

    private String email;

    private Integer height;

    private String image;

    private Company.Address address;

    private String ip;

    private Double weight;

    private String userAgent;

    private String birthDate;

    private String firstName;

    private String macAddress;

    private String phone;

    private String domain;

    private Integer age;

    private String username;

    public String getLastName() {
      return this.lastName;
    }

    public void setLastName(String lastName) {
      this.lastName = lastName;
    }

    public String getGender() {
      return this.gender;
    }

    public void setGender(String gender) {
      this.gender = gender;
    }

    public String getUniversity() {
      return this.university;
    }

    public void setUniversity(String university) {
      this.university = university;
    }

    public String getMaidenName() {
      return this.maidenName;
    }

    public void setMaidenName(String maidenName) {
      this.maidenName = maidenName;
    }

    public String getEin() {
      return this.ein;
    }

    public void setEin(String ein) {
      this.ein = ein;
    }

    public String getSsn() {
      return this.ssn;
    }

    public void setSsn(String ssn) {
      this.ssn = ssn;
    }

    public String getBloodGroup() {
      return this.bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
      this.bloodGroup = bloodGroup;
    }

    public String getPassword() {
      return this.password;
    }

    public void setPassword(String password) {
      this.password = password;
    }

    public Hair getHair() {
      return this.hair;
    }

    public void setHair(Hair hair) {
      this.hair = hair;
    }

    public Bank getBank() {
      return this.bank;
    }

    public void setBank(Bank bank) {
      this.bank = bank;
    }

    public String getEyeColor() {
      return this.eyeColor;
    }

    public void setEyeColor(String eyeColor) {
      this.eyeColor = eyeColor;
    }

    public Company getCompany() {
      return this.company;
    }

    public void setCompany(Company company) {
      this.company = company;
    }

    public Integer getId() {
      return this.id;
    }

    public void setId(Integer id) {
      this.id = id;
    }

    public String getEmail() {
      return this.email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public Integer getHeight() {
      return this.height;
    }

    public void setHeight(Integer height) {
      this.height = height;
    }

    public String getImage() {
      return this.image;
    }

    public void setImage(String image) {
      this.image = image;
    }

    public Company.Address getAddress() {
      return this.address;
    }

    public void setAddress(Company.Address address) {
      this.address = address;
    }

    public String getIp() {
      return this.ip;
    }

    public void setIp(String ip) {
      this.ip = ip;
    }

    public Double getWeight() {
      return this.weight;
    }

    public void setWeight(Double weight) {
      this.weight = weight;
    }

    public String getUserAgent() {
      return this.userAgent;
    }

    public void setUserAgent(String userAgent) {
      this.userAgent = userAgent;
    }

    public String getBirthDate() {
      return this.birthDate;
    }

    public void setBirthDate(String birthDate) {
      this.birthDate = birthDate;
    }

    public String getFirstName() {
      return this.firstName;
    }

    public void setFirstName(String firstName) {
      this.firstName = firstName;
    }

    public String getMacAddress() {
      return this.macAddress;
    }

    public void setMacAddress(String macAddress) {
      this.macAddress = macAddress;
    }

    public String getPhone() {
      return this.phone;
    }

    public void setPhone(String phone) {
      this.phone = phone;
    }

    public String getDomain() {
      return this.domain;
    }

    public void setDomain(String domain) {
      this.domain = domain;
    }

    public Integer getAge() {
      return this.age;
    }

    public void setAge(Integer age) {
      this.age = age;
    }

    public String getUsername() {
      return this.username;
    }

    public void setUsername(String username) {
      this.username = username;
    }

    public static class Hair implements Serializable {
      private String color;

      private String type;

      public String getColor() {
        return this.color;
      }

      public void setColor(String color) {
        this.color = color;
      }

      public String getType() {
        return this.type;
      }

      public void setType(String type) {
        this.type = type;
      }
    }

    public static class Bank implements Serializable {
      private String iban;

      private String cardExpire;

      private String cardType;

      private String currency;

      private String cardNumber;

      public String getIban() {
        return this.iban;
      }

      public void setIban(String iban) {
        this.iban = iban;
      }

      public String getCardExpire() {
        return this.cardExpire;
      }

      public void setCardExpire(String cardExpire) {
        this.cardExpire = cardExpire;
      }

      public String getCardType() {
        return this.cardType;
      }

      public void setCardType(String cardType) {
        this.cardType = cardType;
      }

      public String getCurrency() {
        return this.currency;
      }

      public void setCurrency(String currency) {
        this.currency = currency;
      }

      public String getCardNumber() {
        return this.cardNumber;
      }

      public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
      }
    }

    public static class Company implements Serializable {
      private Address address;

      private String name;

      private String department;

      private String title;

      public Address getAddress() {
        return this.address;
      }

      public void setAddress(Address address) {
        this.address = address;
      }

      public String getName() {
        return this.name;
      }

      public void setName(String name) {
        this.name = name;
      }

      public String getDepartment() {
        return this.department;
      }

      public void setDepartment(String department) {
        this.department = department;
      }

      public String getTitle() {
        return this.title;
      }

      public void setTitle(String title) {
        this.title = title;
      }

      public static class Address implements Serializable {
        private String address;

        private String city;

        private String postalCode;

        private Coordinates coordinates;

        private String state;

        public String getAddress() {
          return this.address;
        }

        public void setAddress(String address) {
          this.address = address;
        }

        public String getCity() {
          return this.city;
        }

        public void setCity(String city) {
          this.city = city;
        }

        public String getPostalCode() {
          return this.postalCode;
        }

        public void setPostalCode(String postalCode) {
          this.postalCode = postalCode;
        }

        public Coordinates getCoordinates() {
          return this.coordinates;
        }

        public void setCoordinates(Coordinates coordinates) {
          this.coordinates = coordinates;
        }

        public String getState() {
          return this.state;
        }

        public void setState(String state) {
          this.state = state;
        }

        public static class Coordinates implements Serializable {
          private Double lng;

          private Double lat;

          public Double getLng() {
            return this.lng;
          }

          public void setLng(Double lng) {
            this.lng = lng;
          }

          public Double getLat() {
            return this.lat;
          }

          public void setLat(Double lat) {
            this.lat = lat;
          }
        }
      }
    }
  }
}
