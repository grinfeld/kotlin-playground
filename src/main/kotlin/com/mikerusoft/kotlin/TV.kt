package com.mikerusoft.kotlin

class TV {
    private var volume = 0

    val remote: Remote
        get() = TVRemote()

    override fun toString(): String = "Volume: ${volume}"

    inner class TVRemote : Remote {
        override fun up() { volume++ }
        override fun down() { volume-- }

        override fun toString() = "Remote: ${this@TV.toString()}"
    }
}

