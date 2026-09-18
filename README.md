# IntelArch Simulator

## Overview
The IntelArch Simulator is a modular, Java-based application designed to model and compare the computational performance of different Intel processor architectures. It bridges the gap between theoretical computer architecture concepts and tangible performance metrics by simulating workload execution across 32-bit and 64-bit systems. Users can visualize the efficiency gains and throughput improvements achieved by modern multi-core processors over legacy models.

## Features
* **Custom CPU Modeling:** Instantiate CPUs with specific core counts, threads, base clock speeds, and bit-architectures (32-bit vs. 64-bit).
* **Workload Simulation:** Generate and run simulated computational tasks against defined CPU models using thread delay calculations.
* **Comparative Analytics:** Automatically calculate and display execution times and performance differentials between processors.
* **Robust Input Validation:** Ensures stable execution with built-in error handling for user inputs.

## Technologies Used
* **Language:** Java (JDK 8 or higher)
* **Design Principles:** Strict Object-Oriented Programming (OOP)
* **Environment:** CLI-based, compatible with standard terminals and cloud IDEs (e.g., Replit).
