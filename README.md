"# Quantum-Radar"

How It Works

1. The radar receives:
   - Plate Number
   - Vehicle Type
   - Vehicle Speed
   - Date

2. The system checks the allowed speed limit.

3. If the vehicle exceeds the speed limit:
   - A violation is created.
   - The corresponding fine is added.
   - The violation is stored under the vehicle.

4. Reports can then display:
   - Vehicle violations
   - Total fine amount
   - Number of violations per rule
     
<img width="927" height="816" alt="output" src="https://github.com/user-attachments/assets/089686c1-23df-4b69-80f7-b456f755d805" />



```text
Quantum-Radar/
├── src/
│   ├── constants/
│   │   ├── ErrorMessages.java
│   │   ├── FeesOfViolation.java
│   │   └── MaxSpeed.java
│   │
│   ├── exceptions/
│   │   └── InvalidDataException.java
│   │
│   ├── model/
│   │   ├── CarType.java
│   │   ├── Fine.java
│   │   ├── Observation.java
│   │   └── Violation.java
│   │
│   ├── radar/
│   │   └── Radar.java
│   │
│   ├── rules/
│   │   ├── Rules.java
│   │   ├── SeatbeltRule.java
│   │   └── SpeedLimitRule.java
│   │
│   └── Main.java
│
└── README.md
```
