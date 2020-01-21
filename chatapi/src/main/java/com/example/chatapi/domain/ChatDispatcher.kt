package com.example.chatapi.domain

import com.example.chatapi.ChatAction
import com.example.chatapi.ChatActionSupplier
import io.reactivex.Observable

internal interface ChatDispatcher : ChatActionSupplier {
    fun observeChatAction(): Observable<ChatAction>
}