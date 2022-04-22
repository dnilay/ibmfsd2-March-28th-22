package com.example.demo.service;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserEntity;
import com.example.demo.repository.UserRepository;
import com.example.dto.UserDto;

import lombok.AllArgsConstructor;
@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

	private final ModelMapper modelMapper;
	private final UserRepository userRepository;
	@Override
	public UserDto createUser(UserDto userDto) {
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		UserEntity userEntity=modelMapper.map(userDto, UserEntity.class);
		StringBuffer buffer=new StringBuffer(userDto.getPassword());
		userEntity.setEncryptedPassword(buffer.reverse().toString());
		UserEntity tempUserEntity=userRepository.save(userEntity);
		
		return modelMapper.map(tempUserEntity, UserDto.class);
	}

}
