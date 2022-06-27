/*
 * Copyright 2022 The Android Open Source Project
 *  
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *  
 *       https://www.apache.org/licenses/LICENSE-2.0
 *  
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */

package com.google.samples.apps.nowinandroid.interests

import androidx.benchmark.macro.MacrobenchmarkScope
import androidx.test.uiautomator.By
import androidx.test.uiautomator.Direction

fun MacrobenchmarkScope.interestsScrollTopicsDownUp() {
    val topicsList = device.findObject(By.res("interests:topics"))
    topicsList.fling(Direction.DOWN)
    device.waitForIdle()
    topicsList.fling(Direction.UP)
}

fun MacrobenchmarkScope.interestsScrollPeopleDownUp() {
    val peopleList = device.findObject(By.res("interests:people"))
    peopleList.fling(Direction.DOWN)
    device.waitForIdle()
    peopleList.fling(Direction.UP)
}
