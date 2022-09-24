package server

import org.grails.web.json.JSONArray
import org.grails.web.json.JSONObject
import grails.converters.JSON
import grails.gorm.transactions.Transactional

// this is for in game connections from the away team to their ship for additional game play info
class ShipControlsController {
    def getScans() {}
    def engineering() {}
    def runShipDiagnostic() {}
    //ships, crews, away teams, planets, UFP, vulcan, etc
    def commsWithOthers() {}
    def LCARS() {}
}
