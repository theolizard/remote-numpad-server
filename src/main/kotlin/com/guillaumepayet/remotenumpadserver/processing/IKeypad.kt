/*
 * Remote Numpad Server - a server for the Remote Numpad.
 * Copyright (C) 2016-2018 Guillaume Payet
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.guillaumepayet.remotenumpadserver.processing

/**
 * A virtual keypad which receives key events to simulate them
 */
interface IKeypad {

    /**
     * Simulate a key press
     */
    fun pressKey(keyCode: Int)

    /**
     * Simulate a key release
     */
    fun releaseKey(keyCode: Int)
}