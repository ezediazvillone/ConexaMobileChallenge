package com.example.conexamobilechallenge.di

import com.example.conexamobilechallenge.data.datasource.remote.mapper.AddressMapper
import com.example.conexamobilechallenge.data.datasource.remote.mapper.GeoMapper
import com.example.conexamobilechallenge.data.datasource.remote.mapper.NewsMapper
import com.example.conexamobilechallenge.data.datasource.remote.mapper.UserMapper
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MapperModule {

    @Provides
    @Singleton
    fun provideNewsMapper(): NewsMapper {
        return NewsMapper()
    }

    @Provides
    @Singleton
    fun provideUserMapper(
        addressMapper: AddressMapper
    ): UserMapper {
        return UserMapper(addressMapper)
    }

    @Provides
    @Singleton
    fun provideAddressMapper(
        geoMapper: GeoMapper
    ): AddressMapper {
        return AddressMapper(geoMapper)
    }

    @Provides
    @Singleton
    fun provideGeoMapper(): GeoMapper {
        return GeoMapper()
    }
}