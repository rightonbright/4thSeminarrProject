package com.example.imsihyun.a4thseminarrproject

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.RequestManager
import com.example.imsihyun.a4thseminarrproject.get.GetBoardResponseData

class BoardAdapter(var boardItems : ArrayList<GetBoardResponseData>, var requestManager : RequestManager)  : RecyclerView.Adapter<BoardViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardViewHolder {
        val mainView : View = LayoutInflater.from(parent.context)
                .inflate(R.layout.board_item, parent, false) // 게시판 첫 화면에 이미지
        return BoardViewHolder(mainView)
    }

    override fun getItemCount(): Int = boardItems.size

    override fun onBindViewHolder(holder: BoardViewHolder, position: Int) {
        holder!!.boardContext.text    = boardItems[position].board_content
        holder!!.boardId.text         = boardItems[position].user_id
        holder!!.boardTime.text       = boardItems[position].board_writetime
        holder!!.boardTitle.text      = boardItems[position].board_title

        requestManager.load(boardItems[position].board_photo).into(holder.boardProfile)
    }
}


