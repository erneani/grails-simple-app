package code.dub

class Post {

    Date postDate
    String title
    String description
    static belongsTo = [user: User]

    static constraints = {
    }
}
