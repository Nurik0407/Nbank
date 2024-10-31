package com.example.nbank.repositories.custom.impl;

import com.example.nbank.dto.client.ClientResponse;
import com.example.nbank.repositories.custom.CustomClientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomClientRepositoryImpl implements CustomClientRepository {
    private final JdbcTemplate jdbcTemplate;

    @Override
    public List<ClientResponse> getAllClients() {

        String sql = """
                SELECT c.id,CONCAT(c.last_name,' ',c.first_name) AS full_name,
                                c.birth_date,c.number_passport,c.inn FROM clients c 
                """;

        return jdbcTemplate.query(sql, (resultset, i) ->
                new ClientResponse(
                        resultset.getLong("id"),
                        resultset.getString("full_name"),
                        resultset.getDate("birth_date").toLocalDate(),
                        resultset.getString("number_passport"),
                        resultset.getString("inn")
                )
        );
    }
}
