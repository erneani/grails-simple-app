package code.dub

class User {

    String username
    String password
    static hasMany = [posts:Post]

    static constraints = {
      username required: true, unique: true, blank: false, size: 3..25
      password required: true, unique: true, blank: false, size: 5..128, password: true
    }

}
