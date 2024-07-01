package com.example.conexamobilechallenge

import com.example.conexamobilechallenge.domain.model.AddressDomainModel
import com.example.conexamobilechallenge.domain.model.GeoDomainModel
import com.example.conexamobilechallenge.domain.model.UserDomainModel
import com.example.conexamobilechallenge.domain.repository.Repository
import com.example.conexamobilechallenge.domain.usecase.GetUserListUseCase
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetUserListUseCaseTest {

    @MockK
    private lateinit var repository: Repository

    private lateinit var getUserListUseCase: GetUserListUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getUserListUseCase = GetUserListUseCase(repository)
    }

    @Test
    fun `get user list from the repository`() = runBlocking {
        //Given
        coEvery { repository.getUserList() } returns userList()
        //When
        val result = getUserListUseCase()
        //Then
        assert(result.isNotEmpty())
        assert(result.size == 1)
        assert(result.first().id == 1)
        assert(result.first().name == "Ezequiel")
    }

    @Test
    fun `get empty user list from the repository`() = runBlocking {
        //Given
        coEvery { repository.getUserList() } returns emptyList()
        //When
        val result = getUserListUseCase()
        //Then
        assert(result.isEmpty())
    }

    private fun userList() = listOf(
        UserDomainModel(
            id = 1,
            name = "Ezequiel",
            lastName = "Diaz Villone",
            address = AddressDomainModel(
                street = "Avenida Siempreviva 742",
                suite = "",
                city = "Springfield",
                geo = GeoDomainModel(lat = "", lng = "")
            )
        )
    )

}