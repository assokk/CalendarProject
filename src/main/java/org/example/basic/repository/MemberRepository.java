package org.example.basic.repository;

import org.example.basic.entity.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Schedule, Long> {
}
