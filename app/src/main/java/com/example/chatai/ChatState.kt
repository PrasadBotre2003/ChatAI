package com.ahmedapps.geminichatbot

import android.graphics.Bitmap
import com.ahmedapps.geminichatbot.data.Chat


data class ChatState (
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
//   <changelist_data name="ahmed-guedmioui" email="ahmedgire01@gmail.com" />

