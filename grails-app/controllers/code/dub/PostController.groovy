package code.dub

class PostController {

  def create() {
    def post = new Post(params)
    post.save()
  }

}
