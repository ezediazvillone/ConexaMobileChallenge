package com.example.conexamobilechallenge

import com.example.conexamobilechallenge.domain.model.NewsDomainModel
import com.example.conexamobilechallenge.domain.repository.Repository
import com.example.conexamobilechallenge.domain.usecase.FilterNewsListUseCase
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

class FilterNewsListUseCaseTest {

    @MockK
    private lateinit var repository: Repository

    private lateinit var filterNewsListUseCaseTest: FilterNewsListUseCase

    @Before
    fun onBefore() {
        MockKAnnotations.init(this)
        filterNewsListUseCaseTest = FilterNewsListUseCase(repository)
    }

    @Test
    fun `get news list from the repository and filter by search`() = runBlocking {
        //Given
        coEvery { repository.getNewsList() } returns newsList()
        //When
        val resultSearch1 = filterNewsListUseCaseTest("Lorem ipsum")
        val resultSearch2 = filterNewsListUseCaseTest("Quisque non")
        val resultSearch3 = filterNewsListUseCaseTest("Lorem ipsum Quisque non")
        //Then
        assert(resultSearch1.size == 1)
        assert(resultSearch1.first().id == 1)
        assert(resultSearch1.first().title == "Lorem ipsum dolor sit amet, consectetur adipiscing elit.")
        assert(resultSearch2.size == 1)
        assert(resultSearch2.first().id == 2)
        assert(resultSearch2.first().title == "Quisque non ligula laoreet, volutpat velit cursus, condimentum arcu.")
        assert(resultSearch3.isEmpty())
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
        ), NewsDomainModel(
            id = 2,
            title = "Quisque non ligula laoreet, volutpat velit cursus, condimentum arcu.",
            content = "Placerat erat consectetur mauris sollicitudin facilisis praesent nam nascetur! Semper odio est condimentum sollicitudin fames orci porttitor consequat platea urna. Sit faucibus luctus sollicitudin, purus euismod. Volutpat habitasse molestie magnis tempus tempus conubia! Quam fringilla vitae, lacus tortor fusce. Ante enim pretium proin nec, bibendum tempus ipsum porta. Hac nunc nunc pretium! Mauris consectetur, nulla taciti class. Porttitor, nulla rutrum integer torquent accumsan magnis? Morbi condimentum senectus pulvinar duis; himenaeos adipiscing. Lacus facilisi ad scelerisque vestibulum nisl. Mi torquent curae; gravida molestie sagittis imperdiet habitasse aenean mus. Nibh nibh nisl parturient odio eros lorem suspendisse blandit torquent cum elementum. Nibh feugiat metus cursus rutrum feugiat lacinia suspendisse suscipit mollis dolor eget nisl. Adipiscing ullamcorper lobortis in. Tellus taciti fames elit consectetur laoreet pulvinar. Potenti tristique a mus, eget pharetra! Viverra.",
            image = "https://dummyimage.com/800x430/FFFFFF/lorem-ipsum.png&text=jsonplaceholder.org",
            publishedAt = "25/12/2022 13:10:07",
            url = "https://jsonplaceholder.org/posts/condimentum.",
            category = "lorem"
        )
    )

}