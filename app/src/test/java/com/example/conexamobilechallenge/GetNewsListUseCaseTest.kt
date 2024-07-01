package com.example.conexamobilechallenge

import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.repository.Repository
import com.example.conexamobilechallenge.domain.usecase.GetNewsListUseCase
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class GetNewsListUseCaseTest {

    @MockK
    private lateinit var repository: Repository

    private lateinit var getNewsListUseCase: GetNewsListUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        getNewsListUseCase = GetNewsListUseCase(repository)
    }

    @Test
    fun `get news list from the repository`() = runBlocking {
        //Given
        coEvery { repository.getNewsList() } returns newsList()
        //When
        val result = getNewsListUseCase()
        //Then
        assert(result.isNotEmpty())
        assert(result.size == 1)
        assert(result.first().id == 1)
        assert(result.first().title == "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
    }

    @Test
    fun `get empty news list from the repository`() = runBlocking {
        //Given
        coEvery { repository.getNewsList() } returns emptyList()
        //When
        val result = getNewsListUseCase()
        //Then
        assert(result.isEmpty())
    }

    private fun newsList() = listOf(
        NewsDomainModel(
            id = 1,
            title = "Lorem ipsum dolor sit amet, consectetur adipiscing elit.",
            content = "Ante taciti nulla sit libero orci sed nam. Sagittis suspendisse gravida ornare iaculis cras nullam varius ac ullamcorper. Nunc euismod hendrerit netus ligula aptent potenti. Aliquam volutpat nibh scelerisque at. Ipsum molestie phasellus euismod sagittis mauris, erat ut. Gravida morbi, sagittis blandit quis ipsum mi mus semper dictum amet himenaeos. Accumsan non congue praesent interdum habitasse turpis orci. Ante curabitur porttitor ullamcorper sagittis sem donec, inceptos cubilia venenatis ac. Augue fringilla sodales in ullamcorper enim curae; rutrum hac in sociis! Scelerisque integer varius et euismod aenean nulla. Quam habitasse risus nullam enim. Ultrices etiam viverra mattis aliquam? Consectetur velit vel volutpat eget curae;. Volutpat class mus elementum pulvinar! Nisi tincidunt volutpat consectetur. Primis morbi pulvinar est montes diam himenaeos duis elit est orci. Taciti sociis aptent venenatis dui malesuada dui justo faucibus primis consequat volutpat. Rhoncus ante purus eros nibh, id et hendrerit pellentesque scelerisque vehicula sollicitudin quam. Hac class vitae natoque tortor dolor dui praesent suspendisse. Vehicula euismod tincidunt odio platea aenean habitasse neque ad proin. Bibendum phasellus enim fames risus eget felis et sem fringilla etiam. Integer.",
            image = "https://dummyimage.com/800x430/FFFFFF/lorem-ipsum.png&text=jsonplaceholder.org",
            publishedAt = "04/02/2023 13:25:21",
            url = "https://jsonplaceholder.org/posts/lorem-ipsum",
            category = "lorem"
        )
    )

}