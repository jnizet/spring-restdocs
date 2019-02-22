/*
 * Copyright 2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
@file:Suppress("UNUSED_VARIABLE", "unused")

package org.springframework.restdocs.kotlin

private fun descriptorsNameAndDescriptionArgumentsExample() {
    // positional
    val firstName = Descriptors.field("firstName", "the first name of the user")
    // named
    val lastName = Descriptors.field(path = "firstName", description = "the first name of the user")
}

private fun descriptorsOtherArgumentsDontExample() {
    // DON'T:
    val address = Descriptors.subsection("address", "the address of the user", true)
}

private fun descriptorsOtherArgumentsDoExample() {
    // DO:
    val address = Descriptors.subsection("address", "the address of the user", optional = true)
    val phone = Descriptors.field("phone", ignored = true)
}
