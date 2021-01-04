package com.elkattanman.domain;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

public enum Difficulty{

    EASY, MODERATE, KIND_OF_HARD, HARD
}