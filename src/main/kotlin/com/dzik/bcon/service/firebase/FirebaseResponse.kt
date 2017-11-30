package com.dzik.bcon.service.firebase


import com.fasterxml.jackson.annotation.JsonIgnoreProperties

@JsonIgnoreProperties(ignoreUnknown = true)
class FirebaseResponse {

    var multicast_id: Long = 0
    var success: Int? = null
    var failure: Int? = null
    var canonical_ids: Any? = null
    var results: Any? = null

    override fun toString(): String {
        return "FirebaseResponse{" +
                "multicast_id=" + multicast_id +
                ", success=" + success +
                ", failure=" + failure +
                ", canonical_ids=" + canonical_ids +
                ", results=" + results +
                '}'
    }
}