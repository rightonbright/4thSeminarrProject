package com.example.imsihyun.a4thseminarrproject.get


data class GetBoardResponseData (
        var board_idx       : Int,
        var board_title     : String?,
        var board_content   : String?,
        var board_views     : Int,
        var board_photo     : String?,
        var board_writetime : String?,
        var user_id         : String

)