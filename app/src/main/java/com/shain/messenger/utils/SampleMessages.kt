package com.shain.messenger.utils

import com.shain.messenger.model.Message
import com.shain.messenger.model.MessageType


/**
 * Created by Shain Singh on 2/17/19.
 */
object SampleMessages {


    fun getSampleMessages(): List<Message> {
        val messages = ArrayList<Message>()
        messages.add(Message("Hi", System.currentTimeMillis(), MessageType.SEND))
        messages.add(Message("Hello", System.currentTimeMillis(), MessageType.RECEIVED))
        messages.add(Message("Hi", System.currentTimeMillis(), MessageType.SEND))
        messages.add(Message("Hi", System.currentTimeMillis(), MessageType.SEND))
        messages.add(Message("Testing", System.currentTimeMillis(), MessageType.RECEIVED))
        messages.add(Message("Hi", System.currentTimeMillis(), MessageType.SEND))
        messages.add(Message("Hi", System.currentTimeMillis(), MessageType.SEND))
        messages.add(Message("How are you?", System.currentTimeMillis(), MessageType.SEND))
        messages.add(Message("Hi", System.currentTimeMillis(), MessageType.RECEIVED))
        messages.add(Message("How are you?", System.currentTimeMillis(), MessageType.RECEIVED))
        messages.add(
            Message(
                "I'm fine. \n How are you? \n Hope you're good",
                System.currentTimeMillis(),
                MessageType.RECEIVED
            )
        )
        messages.add(
            Message(
                "I'm fine. \n How are you?",
                System.currentTimeMillis(),
                MessageType.RECEIVED
            )
        )

        messages.add(
            Message(
                "I'm fine. \n How are you Are You OK ? How are you Are You OK ?How are you Are You OK ?How are you Are You OK ?How are you Are You OK ?How are you Are You OK ?How are you Are You OK ?How are you Are You OK ?How are you Are You OK ?How are you Are You OK ?How are you Are You OK ?",
                System.currentTimeMillis(),
                MessageType.RECEIVED
            )
        )

        messages.add(
            Message(
                "I am very good \n thank you",
                System.currentTimeMillis(),
                MessageType.SEND,
                "I'm fine. \n How are you? \n Hope you're good",
                11
            )
        )

        messages.add(Message("How are you?", System.currentTimeMillis(), MessageType.RECEIVED))
        messages.add(
            Message(
                "I'm fine. \n How are you? \n Hope you're good",
                System.currentTimeMillis(),
                MessageType.RECEIVED
            )
        )

        messages.add(
            Message(
                "Hi Is it OK with you",
                System.currentTimeMillis(),
                MessageType.RECEIVED,
                "Hi",
                2
            )
        )

        return messages
    }
}