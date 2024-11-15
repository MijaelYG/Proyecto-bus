export interface Bus {
    idBus: number;
    numero_bus: string;
    placa: string;
    fecha_creacion: string;
    caracteristicas: string;
    idMarca_bus: number;
    actividad: boolean;
  }


export async function fetchBus(): Promise<Bus[]> {
    try {
      const response = await fetch('http://localhost:8080/bus');
      if (!response.ok) {
        throw new Error("Hubo un error den la respuesta");
      }
      const data: Bus[] = await response.json();
      return data;
    } catch (error) {
      console.error('Error al obtener los buses:', error);
      throw error; 
    }
  }