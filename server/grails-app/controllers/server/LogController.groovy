package server

import org.grails.web.json.JSONArray
import org.grails.web.json.JSONObject
import grails.converters.JSON
import grails.gorm.transactions.Transactional

class LogController {
    def static logList = []

    def clearLog() {
        logList = []
        JSONObject jsonObject = new JSONObject()

        jsonObject.put("success", "true")

        render jsonObject as JSON
    }

    def addToLog() {
        logList << params.logEntry

        JSONObject jsonObject = new JSONObject()

        jsonObject.put("success", "true")

        render jsonObject as JSON
    }

    def getLogs() {
        JSONObject jsonObject = new JSONObject()

        jsonObject.put("logList", logList)

        render jsonObject as JSON
    }
}
