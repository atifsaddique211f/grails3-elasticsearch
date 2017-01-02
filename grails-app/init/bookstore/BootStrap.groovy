package bookstore

import com.store.Book

class BootStrap {

    def init = { servletContext ->
        new Book(name: "Book1").save()
        new Book(name: "Book2").save()
        new Book(name: "Book3").save()
        new Book(name: "Book4").save()
        new Book(name: "Book5").save()
        new Book(name: "Book6").save()
        new Book(name: "Book7").save()
        new Book(name: "Book8").save()
    }
    def destroy = {
    }
}
