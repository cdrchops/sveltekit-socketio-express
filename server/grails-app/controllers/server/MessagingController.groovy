package server

import org.grails.web.json.JSONArray
import org.grails.web.json.JSONObject
import grails.converters.JSON
import grails.gorm.transactions.Transactional

class MessagingController {
    static def MESSAGE = "lovely day";

    def clearMessages() {
        MESSAGE = "";
        JSONObject jsonObject = new JSONObject()

        jsonObject.put("success", "true");

        render jsonObject as JSON
    }

    def getMessages() {
        JSONObject jsonObject = new JSONObject()

        jsonObject.put("message", MESSAGE)

        render jsonObject as JSON
    }

//    @Transactional
    def sendMessage() {
        MESSAGE = params.message


        JSONObject jsonObject = new JSONObject()
        jsonObject.put("success", "true");

        render jsonObject as JSON
    }
}
