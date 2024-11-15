export interface Bus {
    id: number;
    numero_bus: string;
    placa: string;
    fecha_creacion: string;
    caracteristicas: string;
    idmarca_bus: number;
    actividad: boolean;
  }


export async function fetchBus(): Promise<Bus[]> {
    try {
      const response = await fetch('https://api.example.com/buses');
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