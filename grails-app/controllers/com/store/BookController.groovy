package com.store


import grails.rest.*
import grails.converters.*
import org.springframework.http.HttpStatus

class BookController extends RestfulController {
    static responseFormats = ['json', 'xml']
    def elasticSearchService

    BookController() {
        super(Book)
    }

    def getBookByName(String name) {
        def result = elasticSearchService.search("${name}")
        def data = [message: "no book found"]
        if (result.searchResults.size > 0) {
            data = result.searchResults[0] as Book
        }
        response.status = HttpStatus.OK.value()
        render data as JSON
    }
}
