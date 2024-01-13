package com.fmi.travelagencyapi.mapper;

import com.fmi.travelagencyapi.dto.ResponseReservationDTO;
import com.fmi.travelagencyapi.entity.Reservation;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ReservationMapper {

    ResponseReservationDTO reservationToResponseReservationDTO(Reservation reservation);
}
