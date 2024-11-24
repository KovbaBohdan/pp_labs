package org.example.hotel.service.impl;

import lombok.RequiredArgsConstructor;
import org.example.hotel.dto.HotelDTO;
import org.example.hotel.entity.Amenity;
import org.example.hotel.entity.Cottage;
import org.example.hotel.entity.Hotel;
import org.example.hotel.repository.AmenityRepository;
import org.example.hotel.repository.CottageRepository;
import org.example.hotel.repository.HotelRepository;
import org.example.hotel.service.HotelService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {
    private final HotelRepository hotelRepository;
    private final CottageRepository cottageRepository;
    private final AmenityRepository amenityRepository;

    @Override
    public HotelDTO getHotelById(long id) {
        Hotel hotel = hotelRepository.getHotelById(id);
        return HotelDTO.fromHotel(hotel);
    }

    @Override
    public List<HotelDTO> getHotels() {
        return hotelRepository.getHotels().stream().map(HotelDTO::fromHotel).collect(Collectors.toList());
    }

    @Override
    public HotelDTO createHotel(final HotelDTO hotelDTO) {
        final Hotel hotel = new Hotel();
        hotel.setName(hotelDTO.getName());

        if (hotelDTO.getCottages() != null) {
            List<Cottage> cottages = hotelDTO.getCottages().stream()
                    .map(cottageDTO -> {
                        Cottage cottage = cottageRepository.getCottageById(cottageDTO.getId());
                        if (cottage == null) {
                            throw new RuntimeException("Cottage with ID " + cottageDTO.getId() + " does not exist.");
                        }
                        return cottage;
                    })
                    .collect(Collectors.toList());
            hotel.setCottages(cottages);
        }

        if (hotelDTO.getAmenities() != null) {
            List<Amenity> amenities = hotelDTO.getAmenities().stream()
                    .map(amenityDTO -> {
                        Amenity amenity = amenityRepository.getAmenityById(amenityDTO.getId());
                        if (amenity == null) {
                            throw new RuntimeException("Amenity with ID " + amenityDTO.getId() + " does not exist.");
                        }
                        return amenity;
                    })
                    .collect(Collectors.toList());
            hotel.setAmenities(amenities);
        }

        hotelRepository.save(hotel);
        return HotelDTO.fromHotel(hotel);
    }

    @Override
    public HotelDTO updateHotel(HotelDTO hotelDTO) {
        Hotel hotel = hotelRepository.getHotelById(hotelDTO.getId());
        hotel.setName(hotelDTO.getName());

        if (hotelDTO.getCottages() != null) {
            List<Cottage> cottages = hotelDTO.getCottages().stream()
                    .map(cottageDTO -> {
                        Cottage cottage = cottageRepository.getCottageById(cottageDTO.getId());
                        if (cottage == null) {
                            throw new RuntimeException("Cottage with ID " + cottageDTO.getId() + " does not exist.");
                        }
                        return cottage;
                    })
                    .collect(Collectors.toList());
            hotel.setCottages(cottages);
        }

        if (hotelDTO.getAmenities() != null) {
            List<Amenity> amenities = hotelDTO.getAmenities().stream()
                    .map(amenityDTO -> {
                        Amenity amenity = amenityRepository.getAmenityById(amenityDTO.getId());
                        if (amenity == null) {
                            throw new RuntimeException("Amenity with ID " + amenityDTO.getId() + " does not exist.");
                        }
                        return amenity;
                    })
                    .collect(Collectors.toList());
            hotel.setAmenities(amenities);
        }

        hotelRepository.updateHotel(hotel);
        return HotelDTO.fromHotel(hotel);
    }

    @Override
    public void deleteById(long id) {
        hotelRepository.deleteHotelById(id);
    }
}




