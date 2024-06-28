package com.example.conexamobilechallenge.domain.usecase

import com.example.conexamobilechallenge.domain.model.User
import javax.inject.Inject

class GetUserListUseCase @Inject constructor() {

    operator fun invoke(): List<User> {
        return listOf(
            User(
                id = 1,
                name = "Joaquin",
                lastName = "Arana",
                address = "Tucuman 3225",
                addressUrl = "https://www.google.com/maps/place/Tucum%C3%A1n+3225,+B1637+La+Lucila,+Provincia+de+Buenos+Aires/@-34.5044039,-58.4947806,17z/data=!3m1!4b1!4m6!3m5!1s0x95bcb111529ab6df:0xa0e9ef10f4070004!8m2!3d-34.5044083!4d-58.4922057!16s%2Fg%2F11c2dm1tk8?entry=ttu"
            ), User(
                id = 2,
                name = "Santino",
                lastName = "Nikolin",
                address = "Lavalle 1310",
                addressUrl = "https://www.google.com/maps/place/CON,+Gral.+Juan+Lavalle+1310,+B1638+Vicente+L%C3%B3pez,+Provincia+de+Buenos+Aires/@-34.5314515,-58.4789545,17z/data=!3m1!4b1!4m6!3m5!1s0x95bcb6b1bc862839:0xe9ab292f0f93b8c9!8m2!3d-34.5314559!4d-58.4763796!16s%2Fg%2F11c28j88w8?entry=ttu"
            ), User(
                id = 3,
                name = "Ezequiel",
                lastName = "Diaz Villone",
                address = "Intendente Lima 4041 (2b)",
                addressUrl = "https://www.google.com/maps/place/Int.+Lima+4041,+B1603AJA+Villa+Martelli,+Provincia+de+Buenos+Aires/@-34.5544301,-58.5065107,17z/data=!3m1!4b1!4m6!3m5!1s0x95bcb6e0c43f673f:0xc8a4e76665e7f1da!8m2!3d-34.5546348!4d-58.5035172!16s%2Fg%2F11f9vxmygl?entry=ttu"
            )
        )
    }

}